package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord
 */
public class SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecord   {
  private String rewardPointsAwardsAndRedemptionServiceConfigurationSettingReference = null;

  private String rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription = null;

  private SDRewardPointsAwardsAndRedemptionActivateInputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceConfigurationSetup rewardPointsAwardsAndRedemptionServiceConfigurationSetup = null;

  private SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription rewardPointsAwardsAndRedemptionServiceSubscription = null;

  private SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement rewardPointsAwardsAndRedemptionServiceAgreement = null;

  private String rewardPointsAwardsAndRedemptionServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription
  **/

  public String getRewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription() {
    return rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription;
  }

  public void setRewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription(String rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription) {
    this.rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription = rewardPointsAwardsAndRedemptionServiceConfigurationSettingDescription;
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


  /**
   * Get rewardPointsAwardsAndRedemptionServiceSubscription
   * @return rewardPointsAwardsAndRedemptionServiceSubscription
  **/

  public SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription getRewardPointsAwardsAndRedemptionServiceSubscription() {
    return rewardPointsAwardsAndRedemptionServiceSubscription;
  }

  public void setRewardPointsAwardsAndRedemptionServiceSubscription(SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceSubscription rewardPointsAwardsAndRedemptionServiceSubscription) {
    this.rewardPointsAwardsAndRedemptionServiceSubscription = rewardPointsAwardsAndRedemptionServiceSubscription;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceAgreement
   * @return rewardPointsAwardsAndRedemptionServiceAgreement
  **/

  public SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement getRewardPointsAwardsAndRedemptionServiceAgreement() {
    return rewardPointsAwardsAndRedemptionServiceAgreement;
  }

  public void setRewardPointsAwardsAndRedemptionServiceAgreement(SDRewardPointsAwardsAndRedemptionActivateOutputModelRewardPointsAwardsAndRedemptionServiceConfigurationRecordRewardPointsAwardsAndRedemptionServiceAgreement rewardPointsAwardsAndRedemptionServiceAgreement) {
    this.rewardPointsAwardsAndRedemptionServiceAgreement = rewardPointsAwardsAndRedemptionServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return rewardPointsAwardsAndRedemptionServiceStatus
  **/

  public String getRewardPointsAwardsAndRedemptionServiceStatus() {
    return rewardPointsAwardsAndRedemptionServiceStatus;
  }

  public void setRewardPointsAwardsAndRedemptionServiceStatus(String rewardPointsAwardsAndRedemptionServiceStatus) {
    this.rewardPointsAwardsAndRedemptionServiceStatus = rewardPointsAwardsAndRedemptionServiceStatus;
  }


}

