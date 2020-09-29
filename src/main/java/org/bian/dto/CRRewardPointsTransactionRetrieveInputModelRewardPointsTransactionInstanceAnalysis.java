package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis
 */
public class CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis   {
  private String rewardPointsTransactionInstanceAnalysisReference = null;

  private String rewardPointsTransactionInstanceAnalysisReportType = null;

  private String rewardPointsTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return rewardPointsTransactionInstanceAnalysisReference
  **/

  public String getRewardPointsTransactionInstanceAnalysisReference() {
    return rewardPointsTransactionInstanceAnalysisReference;
  }

  public void setRewardPointsTransactionInstanceAnalysisReference(String rewardPointsTransactionInstanceAnalysisReference) {
    this.rewardPointsTransactionInstanceAnalysisReference = rewardPointsTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return rewardPointsTransactionInstanceAnalysisParameters
  **/

  public String getRewardPointsTransactionInstanceAnalysisParameters() {
    return rewardPointsTransactionInstanceAnalysisParameters;
  }

  public void setRewardPointsTransactionInstanceAnalysisParameters(String rewardPointsTransactionInstanceAnalysisParameters) {
    this.rewardPointsTransactionInstanceAnalysisParameters = rewardPointsTransactionInstanceAnalysisParameters;
  }


}

