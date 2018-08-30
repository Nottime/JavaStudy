package top.dp.work.d28;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientPost2 {
      public static final String filepath1="C:/Users/A171658/Desktop/test_html/1.jpg";//图片1路径
      public static final String filepath2="C:/Users/A171658/Desktop/test_html/1.jpg";//图片2路径
      public static final String POST_URL = "http://182.180.197.130:4000/identity/watermark_verification/stateless";

      public static void HttpClientPost() throws ClientProtocolException, IOException {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost post = new HttpPost(POST_URL);
            FileBody fileBody1 = new FileBody(new File(filepath1));
            FileBody fileBody2 = new FileBody(new File(filepath2));
            MultipartEntity entity = new MultipartEntity();
            entity.addPart("image_n_file", fileBody1);
            entity.addPart("image_w_file", fileBody2);
            post.setEntity(entity);
            HttpResponse response = httpclient.execute(post);
            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entitys = response.getEntity();
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(entitys.getContent()));
                String line = reader.readLine();
                System.out.println(line);
            }else{
                HttpEntity r_entity = response.getEntity();
                String responseString = EntityUtils.toString(r_entity);
                System.out.println("错误码是："+response.getStatusLine().getStatusCode()+"  "+response.getStatusLine().getReasonPhrase());
                System.out.println("出错原因是："+responseString);
                //你需要根据出错的原因判断错误信息，并修改
            }

            httpclient.getConnectionManager().shutdown();
      }


    public static void main(String[] args) throws ClientProtocolException, IOException {
        HttpClientPost();
    }
}
