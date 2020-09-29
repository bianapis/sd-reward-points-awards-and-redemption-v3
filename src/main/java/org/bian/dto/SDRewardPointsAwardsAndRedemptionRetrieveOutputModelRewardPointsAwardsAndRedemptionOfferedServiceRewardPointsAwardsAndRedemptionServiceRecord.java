package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord   {
  private String rewardPointsAwardsAndRedemptionServiceType = null;

  private String rewardPointsAwardsAndRedemptionServiceVersion = null;

  private String rewardPointsAwardsAndRedemptionServiceDescription = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines = null;

  private String rewardPointsAwardsAndRedemptionServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return rewardPointsAwardsAndRedemptionServiceType
  **/

  public String getRewardPointsAwardsAndRedemptionServiceType() {
    return rewardPointsAwardsAndRedemptionServiceType;
  }

  public void setRewardPointsAwardsAndRedemptionServiceType(String rewardPointsAwardsAndRedemptionServiceType) {
    this.rewardPointsAwardsAndRedemptionServiceType = rewardPointsAwardsAndRedemptionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return rewardPointsAwardsAndRedemptionServiceVersion
  **/

  public String getRewardPointsAwardsAndRedemptionServiceVersion() {
    return rewardPointsAwardsAndRedemptionServiceVersion;
  }

  public void setRewardPointsAwardsAndRedemptionServiceVersion(String rewardPointsAwardsAndRedemptionServiceVersion) {
    this.rewardPointsAwardsAndRedemptionServiceVersion = rewardPointsAwardsAndRedemptionServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return rewardPointsAwardsAndRedemptionServiceDescription
  **/

  public String getRewardPointsAwardsAndRedemptionServiceDescription() {
    return rewardPointsAwardsAndRedemptionServiceDescription;
  }

  public void setRewardPointsAwardsAndRedemptionServiceDescription(String rewardPointsAwardsAndRedemptionServiceDescription) {
    this.rewardPointsAwardsAndRedemptionServiceDescription = rewardPointsAwardsAndRedemptionServiceDescription;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines
   * @return rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines getRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines() {
    return rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines;
  }

  public void setRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecordRewardPointsAwardsAndRedemptionServicePoliciesandGuidelines rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines) {
    this.rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines = rewardPointsAwardsAndRedemptionServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return rewardPointsAwardsAndRedemptionServiceSchedule
  **/

  public String getRewardPointsAwardsAndRedemptionServiceSchedule() {
    return rewardPointsAwardsAndRedemptionServiceSchedule;
  }

  public void setRewardPointsAwardsAndRedemptionServiceSchedule(String rewardPointsAwardsAndRedemptionServiceSchedule) {
    this.rewardPointsAwardsAndRedemptionServiceSchedule = rewardPointsAwardsAndRedemptionServiceSchedule;
  }


}

