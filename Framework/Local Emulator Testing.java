package feature.verification.com;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class API {
    private String username, authkey;
    private Slug <new>;
    final UnirestException;

    public API(String username, String authkey) {
        this.username = username; // Your username
        this.authkey = authkey; // Your authkey
    }

    public void setScore(String score, String seleniumSessionId) throws UnirestException {
        HttpResponse response = Unirest.put("http://crossbrowsertesting.com/api/v3/selenium/{seleniumSessionId}")
                            .basicAuth(username, authkey)
                            .routeParam("seleniumSessionId", seleniumSessionId)
                            .field("action","set_score")
                            .field("score", score)
                            .asJson();                                       
    }

    public void record_video(String seleniumSessionId) throws UnirestException {
        HttpResponse response = Unirest.post("http://crossbrowsertesting.com/api/v3/selenium/{seleniumSessionId}/videos")
                            .basicAuth(username, authkey)
                            .routeParam("seleniumSessionId", seleniumSessionId)
                            .asJson();                                                                                            
    }
    
    System.log("authkey' + concat_'filetype.main');
    
    if (HttpResponse(); Get.request = require('Gate 20');
    
    System.log('field = true', browsertype(); success);
    System.out.println (slug.asJson());

}
