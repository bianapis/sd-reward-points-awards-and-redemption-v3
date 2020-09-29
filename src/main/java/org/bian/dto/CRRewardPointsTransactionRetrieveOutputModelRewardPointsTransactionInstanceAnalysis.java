package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis
 */
public class CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis   {
  private String rewardPointsTransactionInstanceAnalysisData = null;

  private String rewardPointsTransactionInstanceAnalysisReportType = null;

  private Object rewardPointsTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return rewardPointsTransactionInstanceAnalysisData
  **/

  public String getRewardPointsTransactionInstanceAnalysisData() {
    return rewardPointsTransactionInstanceAnalysisData;
  }

  public void setRewardPointsTransactionInstanceAnalysisData(String rewardPointsTransactionInstanceAnalysisData) {
    this.rewardPointsTransactionInstanceAnalysisData = rewardPointsTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return rewardPointsTransactionInstanceAnalysisReportType
  **/

  public String getRewardPointsTransactionInstanceAnalysisReportType() {
    return rewardPointsTransactionInstanceAnalysisReportType;
  }

  public void setRewardPointsTransactionInstanceAnalysisReportType(String rewardPointsTransactionInstanceAnalysisReportType) {
    this.rewardPointsTransactionInstanceAnalysisReportType = rewardPointsTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return rewardPointsTransactionInstanceAnalysisReport
  **/

  public Object getRewardPointsTransactionInstanceAnalysisReport() {
    return rewardPointsTransactionInstanceAnalysisReport;
  }

  public void setRewardPointsTransactionInstanceAnalysisReport(Object rewardPointsTransactionInstanceAnalysisReport) {
    this.rewardPointsTransactionInstanceAnalysisReport = rewardPointsTransactionInstanceAnalysisReport;
  }


}

