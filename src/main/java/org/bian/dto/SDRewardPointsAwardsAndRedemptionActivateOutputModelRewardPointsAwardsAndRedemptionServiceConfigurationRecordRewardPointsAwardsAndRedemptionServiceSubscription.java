package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription
 */
public class SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription   {
  private String rewardPointsAwardsAndRedemptionServiceSubscriberReference = null;

  private String rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return rewardPointsAwardsAndRedemptionServiceSubscriberReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceSubscriberReference() {
    return rewardPointsAwardsAndRedemptionServiceSubscriberReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceSubscriberReference(String rewardPointsAwardsAndRedemptionServiceSubscriberReference) {
    this.rewardPointsAwardsAndRedemptionServiceSubscriberReference = rewardPointsAwardsAndRedemptionServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile
  **/

  public String getRewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile() {
    return rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile;
  }

  public void setRewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile(String rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile) {
    this.rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile = rewardPointsAwardsAndRedemptionServiceSubscriberAccessProfile;
  }


}

