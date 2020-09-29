package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement
 */
public class SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement   {
  private String rewardPointsAwardsAndRedemptionServiceAgreementReference = null;

  private String rewardPointsAwardsAndRedemptionServiceUserReference = null;

  private String rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return rewardPointsAwardsAndRedemptionServiceAgreementReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceAgreementReference() {
    return rewardPointsAwardsAndRedemptionServiceAgreementReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceAgreementReference(String rewardPointsAwardsAndRedemptionServiceAgreementReference) {
    this.rewardPointsAwardsAndRedemptionServiceAgreementReference = rewardPointsAwardsAndRedemptionServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return rewardPointsAwardsAndRedemptionServiceUserReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceUserReference() {
    return rewardPointsAwardsAndRedemptionServiceUserReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceUserReference(String rewardPointsAwardsAndRedemptionServiceUserReference) {
    this.rewardPointsAwardsAndRedemptionServiceUserReference = rewardPointsAwardsAndRedemptionServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions
  **/

  public String getRewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions() {
    return rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions;
  }

  public void setRewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions(String rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions) {
    this.rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions = rewardPointsAwardsAndRedemptionServiceAgreementTermsandConditions;
  }


}

