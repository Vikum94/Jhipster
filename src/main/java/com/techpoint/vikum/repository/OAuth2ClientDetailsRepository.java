package com.techpoint.vikum.repository;


import com.techpoint.vikum.domain.OAuth2AuthenticationClientDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OAuth2ClientDetailsRepository extends MongoRepository<OAuth2AuthenticationClientDetails, String> {

    OAuth2AuthenticationClientDetails findOneByClientId(String clientId);
}
