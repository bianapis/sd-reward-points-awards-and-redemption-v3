package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines   {
  private String rewardPointsAwardsAndRedemptionServiceEligibility = null;

  private String rewardPointsAwardsAndRedemptionServiceIntendedUses = null;

  private String rewardPointsAwardsAndRedemptionServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return rewardPointsAwardsAndRedemptionServiceEligibility
  **/

  public String getRewardPointsAwardsAndRedemptionServiceEligibility() {
    return rewardPointsAwardsAndRedemptionServiceEligibility;
  }

  public void setRewardPointsAwardsAndRedemptionServiceEligibility(String rewardPointsAwardsAndRedemptionServiceEligibility) {
    this.rewardPointsAwardsAndRedemptionServiceEligibility = rewardPointsAwardsAndRedemptionServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return rewardPointsAwardsAndRedemptionServiceIntendedUses
  **/

  public String getRewardPointsAwardsAndRedemptionServiceIntendedUses() {
    return rewardPointsAwardsAndRedemptionServiceIntendedUses;
  }

  public void setRewardPointsAwardsAndRedemptionServiceIntendedUses(String rewardPointsAwardsAndRedemptionServiceIntendedUses) {
    this.rewardPointsAwardsAndRedemptionServiceIntendedUses = rewardPointsAwardsAndRedemptionServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return rewardPointsAwardsAndRedemptionServicePricingandTerms
  **/

  public String getRewardPointsAwardsAndRedemptionServicePricingandTerms() {
    return rewardPointsAwardsAndRedemptionServicePricingandTerms;
  }

  public void setRewardPointsAwardsAndRedemptionServicePricingandTerms(String rewardPointsAwardsAndRedemptionServicePricingandTerms) {
    this.rewardPointsAwardsAndRedemptionServicePricingandTerms = rewardPointsAwardsAndRedemptionServicePricingandTerms;
  }


}

