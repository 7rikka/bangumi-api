package nya.nekoneko.bangumi.util;

import nya.nekoneko.bangumi.exception.RequestException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.time.Duration;

/**
 * 发起网络请求
 */
public class Call {
    private static final OkHttpClient client = new OkHttpClient().newBuilder()
            .readTimeout(Duration.ofSeconds(30))
            .connectTimeout(Duration.ofSeconds(30))
            .callTimeout(Duration.ofSeconds(30))
            .build();

    public static String doCall(Request request) {
        try {
            Response response = client.newCall(request).execute();
            if (200 != response.code()) {
                throw new RequestException(request, response, "HTTP CODE: " + response.code());
            }
            ResponseBody body = response.body();
            if (null == body) {
                throw new RequestException(request, response, "Body为空");
            }
            return body.string();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RequestException(request, null, e.getMessage());
        }
    }
}
