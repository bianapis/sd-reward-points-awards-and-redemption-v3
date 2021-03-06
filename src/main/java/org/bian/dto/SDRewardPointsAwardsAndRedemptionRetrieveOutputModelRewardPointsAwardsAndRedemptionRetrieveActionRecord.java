package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionActivityAnalysis;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord   {
  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionActivityAnalysis rewardPointsAwardsAndRedemptionActivityAnalysis = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionPerformanceAnalysis rewardPointsAwardsAndRedemptionPerformanceAnalysis = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get rewardPointsAwardsAndRedemptionActivityAnalysis
   * @return rewardPointsAwardsAndRedemptionActivityAnalysis
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionActivityAnalysis getRewardPointsAwardsAndRedemptionActivityAnalysis() {
    return rewardPointsAwardsAndRedemptionActivityAnalysis;
  }

  public void setRewardPointsAwardsAndRedemptionActivityAnalysis(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionActivityAnalysis rewardPointsAwardsAndRedemptionActivityAnalysis) {
    this.rewardPointsAwardsAndRedemptionActivityAnalysis = rewardPointsAwardsAndRedemptionActivityAnalysis;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionPerformanceAnalysis
   * @return rewardPointsAwardsAndRedemptionPerformanceAnalysis
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionPerformanceAnalysis getRewardPointsAwardsAndRedemptionPerformanceAnalysis() {
    return rewardPointsAwardsAndRedemptionPerformanceAnalysis;
  }

  public void setRewardPointsAwardsAndRedemptionPerformanceAnalysis(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordRewardPointsAwardsAndRedemptionPerformanceAnalysis rewardPointsAwardsAndRedemptionPerformanceAnalysis) {
    this.rewardPointsAwardsAndRedemptionPerformanceAnalysis = rewardPointsAwardsAndRedemptionPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

