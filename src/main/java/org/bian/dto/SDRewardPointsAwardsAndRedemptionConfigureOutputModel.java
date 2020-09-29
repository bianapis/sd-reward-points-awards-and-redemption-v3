package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionConfigureOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionConfigureOutputModel
 */
public class SDRewardPointsAwardsAndRedemptionConfigureOutputModel   {
  private String rewardPointsAwardsAndRedemptionConfigurationActionTaskReference = null;

  private Object rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord = null;

  private SDRewardPointsAwardsAndRedemptionConfigureOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord = null;

  private String rewardPointsAwardsAndRedemptionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return rewardPointsAwardsAndRedemptionConfigurationActionTaskReference
  **/

  public String getRewardPointsAwardsAndRedemptionConfigurationActionTaskReference() {
    return rewardPointsAwardsAndRedemptionConfigurationActionTaskReference;
  }

  public void setRewardPointsAwardsAndRedemptionConfigurationActionTaskReference(String rewardPointsAwardsAndRedemptionConfigurationActionTaskReference) {
    this.rewardPointsAwardsAndRedemptionConfigurationActionTaskReference = rewardPointsAwardsAndRedemptionConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord
  **/

  public Object getRewardPointsAwardsAndRedemptionConfigurationActionTaskRecord() {
    return rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord;
  }

  public void setRewardPointsAwardsAndRedemptionConfigurationActionTaskRecord(Object rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord) {
    this.rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord = rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceConfigurationRecord
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationRecord
  **/

  public SDRewardPointsAwardsAndRedemptionConfigureOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord getRewardPointsAwardsAndRedemptionServiceConfigurationRecord() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationRecord(SDRewardPointsAwardsAndRedemptionConfigureOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationRecord = rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return rewardPointsAwardsAndRedemptionServicingSessionStatus
  **/

  public String getRewardPointsAwardsAndRedemptionServicingSessionStatus() {
    return rewardPointsAwardsAndRedemptionServicingSessionStatus;
  }

  public void setRewardPointsAwardsAndRedemptionServicingSessionStatus(String rewardPointsAwardsAndRedemptionServicingSessionStatus) {
    this.rewardPointsAwardsAndRedemptionServicingSessionStatus = rewardPointsAwardsAndRedemptionServicingSessionStatus;
  }


}

