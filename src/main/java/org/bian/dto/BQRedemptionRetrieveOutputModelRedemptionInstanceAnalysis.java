package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRedemptionRetrieveOutputModelRedemptionInstanceAnalysis
 */
public class BQRedemptionRetrieveOutputModelRedemptionInstanceAnalysis   {
  private Object redemptionInstanceAnalysisRecord = null;

  private String redemptionInstanceAnalysisReportType = null;

  private String redemptionInstanceAnalysisParameters = null;

  private Object redemptionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return redemptionInstanceAnalysisRecord
  **/

  public Object getRedemptionInstanceAnalysisRecord() {
    return redemptionInstanceAnalysisRecord;
  }

  public void setRedemptionInstanceAnalysisRecord(Object redemptionInstanceAnalysisRecord) {
    this.redemptionInstanceAnalysisRecord = redemptionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return redemptionInstanceAnalysisReportType
  **/

  public String getRedemptionInstanceAnalysisReportType() {
    return redemptionInstanceAnalysisReportType;
  }

  public void setRedemptionInstanceAnalysisReportType(String redemptionInstanceAnalysisReportType) {
    this.redemptionInstanceAnalysisReportType = redemptionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return redemptionInstanceAnalysisParameters
  **/

  public String getRedemptionInstanceAnalysisParameters() {
    return redemptionInstanceAnalysisParameters;
  }

  public void setRedemptionInstanceAnalysisParameters(String redemptionInstanceAnalysisParameters) {
    this.redemptionInstanceAnalysisParameters = redemptionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return redemptionInstanceAnalysisReport
  **/

  public Object getRedemptionInstanceAnalysisReport() {
    return redemptionInstanceAnalysisReport;
  }

  public void setRedemptionInstanceAnalysisReport(Object redemptionInstanceAnalysisReport) {
    this.redemptionInstanceAnalysisReport = redemptionInstanceAnalysisReport;
  }


}

