package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord
 */
public class SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord   {
  private String rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference = null;

  private String rewardPointsAwardsAndRedemptionServiceConfigurationSettingType = null;

  private SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup rewardPointsAwardsAndRedemptionServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceConfigurationSettingReference() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationSettingReference(String rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference = rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationSettingType
  **/

  public String getRewardPointsAwardsAndRedemptionServiceConfigurationSettingType() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationSettingType;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationSettingType(String rewardPointsAwardsAndRedemptionServiceConfigurationSettingType) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationSettingType = rewardPointsAwardsAndRedemptionServiceConfigurationSettingType;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceConfigurationSetup
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationSetup
  **/

  public SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup getRewardPointsAwardsAndRedemptionServiceConfigurationSetup() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationSetup;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationSetup(SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup rewardPointsAwardsAndRedemptionServiceConfigurationSetup) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationSetup = rewardPointsAwardsAndRedemptionServiceConfigurationSetup;
  }


}

