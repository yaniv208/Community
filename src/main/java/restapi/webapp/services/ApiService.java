package restapi.webapp.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import restapi.webapp.entities.AvatarEntity;
import restapi.webapp.entities.UserEntity;
import restapi.webapp.enums.HairColor;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class ApiService {
    private final ObjectMapper objectMapper;
    private final Map<String, String> userRetrieveTypes;

    public ApiService() {
        this.objectMapper = new ObjectMapper();
        userRetrieveTypes = Map.of("random", "https://randomuser.me/api?exc=picture,cell,nat,registered&noinfo",
                "male", "https://randomuser.me/api/?gender=male&exc=picture,cell,nat,registered&noinfo",
                "female", "https://randomuser.me/api/?gender=female&exc=picture,cell,nat,registered&noinfo");
    }

    @SneakyThrows
    @Async
    public CompletableFuture<UserEntity> getUserByType(String userType) {
        log.info("Trying to fetch data from API");
       String jsonStringRepresentation = IOUtils.toString(new URL(userRetrieveTypes.get(userType)), StandardCharsets.UTF_8);
       log.info("Data fetched successfully");
       log.info("Trying to map JSON into a Java object");
        if (jsonStringRepresentation!=null) {
            JSONObject rawJson = new JSONObject(jsonStringRepresentation);
            JSONArray jsonArrayToExtractUser = rawJson.getJSONArray("results");
            JSONObject userJson = jsonArrayToExtractUser.getJSONObject(0);
            UserEntity user = objectMapper.readValue(userJson.toString(), UserEntity.class);
            user.setAvatarEntity(generateRandomAvatarEntity(user.getEmail()));
            log.info("Successfully mapped JSON into a Java object");
            return CompletableFuture.completedFuture(user);
        }
        else {
            return CompletableFuture.failedFuture(new Throwable("Connection to API wasn't successful."));
        }
    }

    public AvatarEntity generateRandomAvatarEntity(String seed) {
        AvatarEntity randomAvatarForUser = new AvatarEntity();
        randomAvatarForUser.setSeed(seed);
        randomAvatarForUser.setEyes((int)Math.floor(Math.random()*(26-1+1)+1));
        randomAvatarForUser.setEyebrows((int)Math.floor(Math.random()*(10-1+1)+1));
        randomAvatarForUser.setMouth((int)Math.floor(Math.random()*(30-1+1)+1));
        final List<HairColor> HairColorValues =
                List.of(HairColor.values());
        final Random random = new Random();
        randomAvatarForUser.setHairColor(HairColorValues.get(random.nextInt(HairColorValues.size())).toString());
        randomAvatarForUser.setResultUrl(randomAvatarForUser.createResultUrl());
        return randomAvatarForUser;
    }

}
