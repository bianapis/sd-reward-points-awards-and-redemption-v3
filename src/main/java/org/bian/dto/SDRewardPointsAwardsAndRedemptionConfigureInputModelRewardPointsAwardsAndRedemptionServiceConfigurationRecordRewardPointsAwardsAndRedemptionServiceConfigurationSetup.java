package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup
 */
public class SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup   {
  private String rewardPointsAwardsAndRedemptionServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationParameter
  **/

  public String getRewardPointsAwardsAndRedemptionServiceConfigurationParameter() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationParameter;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationParameter(String rewardPointsAwardsAndRedemptionServiceConfigurationParameter) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationParameter = rewardPointsAwardsAndRedemptionServiceConfigurationParameter;
  }


}

