package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionActivateOutputModel
 */
public class SDRewardPointsAwardsAndRedemptionActivateOutputModel   {
  private String rewardPointsAwardsAndRedemptionActivationActionTaskReference = null;

  private Object rewardPointsAwardsAndRedemptionActivationActionTaskRecord = null;

  private String rewardPointsAwardsAndRedemptionServicingSessionReference = null;

  private Object rewardPointsAwardsAndRedemptionServicingSessionRecord = null;

  private SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord = null;

  private String rewardPointsAwardsAndRedemptionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return rewardPointsAwardsAndRedemptionActivationActionTaskReference
  **/

  public String getRewardPointsAwardsAndRedemptionActivationActionTaskReference() {
    return rewardPointsAwardsAndRedemptionActivationActionTaskReference;
  }

  public void setRewardPointsAwardsAndRedemptionActivationActionTaskReference(String rewardPointsAwardsAndRedemptionActivationActionTaskReference) {
    this.rewardPointsAwardsAndRedemptionActivationActionTaskReference = rewardPointsAwardsAndRedemptionActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return rewardPointsAwardsAndRedemptionServicingSessionRecord
  **/

  public Object getRewardPointsAwardsAndRedemptionServicingSessionRecord() {
    return rewardPointsAwardsAndRedemptionServicingSessionRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServicingSessionRecord(Object rewardPointsAwardsAndRedemptionServicingSessionRecord) {
    this.rewardPointsAwardsAndRedemptionServicingSessionRecord = rewardPointsAwardsAndRedemptionServicingSessionRecord;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceConfigurationRecord
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationRecord
  **/

  public SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord getRewardPointsAwardsAndRedemptionServiceConfigurationRecord() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationRecord(SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord rewardPointsAwardsAndRedemptionServiceConfigurationRecord) {
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

