package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionActivateInputModel
 */
public class SDRewardPointsAwardsAndRedemptionActivateInputModel   {
  private Object rewardPointsAwardsAndRedemptionActivationActionTaskRecord = null;

  private String rewardPointsAwardsAndRedemptionCenterReference = null;

  private String rewardPointsAwardsAndRedemptionServiceReference = null;

  private SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return rewardPointsAwardsAndRedemptionActivationActionTaskRecord
  **/

  public Object getRewardPointsAwardsAndRedemptionActivationActionTaskRecord() {
    return rewardPointsAwardsAndRedemptionActivationActionTaskRecord;
  }

  public void setRewardPointsAwardsAndRedemptionActivationActionTaskRecord(Object rewardPointsAwardsAndRedemptionActivationActionTaskRecord) {
    this.rewardPointsAwardsAndRedemptionActivationActionTaskRecord = rewardPointsAwardsAndRedemptionActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return rewardPointsAwardsAndRedemptionCenterReference
  **/

  public String getRewardPointsAwardsAndRedemptionCenterReference() {
    return rewardPointsAwardsAndRedemptionCenterReference;
  }

  public void setRewardPointsAwardsAndRedemptionCenterReference(String rewardPointsAwardsAndRedemptionCenterReference) {
    this.rewardPointsAwardsAndRedemptionCenterReference = rewardPointsAwardsAndRedemptionCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return rewardPointsAwardsAndRedemptionServiceReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceReference() {
    return rewardPointsAwardsAndRedemptionServiceReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceReference(String rewardPointsAwardsAndRedemptionServiceReference) {
    this.rewardPointsAwardsAndRedemptionServiceReference = rewardPointsAwardsAndRedemptionServiceReference;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceConfigurationRecord
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationRecord
  **/

  public SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord getRewardPointsAwardsAndRedemptionServiceConfigurationRecord() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationRecord(SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationRecord = rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }


}

