package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionConfigureInputModel
 */
public class SDRewardPointsAwardsAndRedemptionConfigureInputModel   {
  private Object rewardPointsAwardsAndRedemptionConfigurationActionTaskRecord = null;

  private String rewardPointsAwardsAndRedemptionServicingSessionReference = null;

  private String rewardPointsAwardsAndRedemptionServiceReference = null;

  private SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return rewardPointsAwardsAndRedemptionServicingSessionReference
  **/

  public String getRewardPointsAwardsAndRedemptionServicingSessionReference() {
    return rewardPointsAwardsAndRedemptionServicingSessionReference;
  }

  public void setRewardPointsAwardsAndRedemptionServicingSessionReference(String rewardPointsAwardsAndRedemptionServicingSessionReference) {
    this.rewardPointsAwardsAndRedemptionServicingSessionReference = rewardPointsAwardsAndRedemptionServicingSessionReference;
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

  public SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord getRewardPointsAwardsAndRedemptionServiceConfigurationRecord() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationRecord(SDRewardPointsAwardsAndRedemptionConfigureInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationRecord = rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }


}

