package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAwardRetrieveOutputModelAwardInstanceAnalysis
 */
public class BQAwardRetrieveOutputModelAwardInstanceAnalysis   {
  private Object awardInstanceAnalysisRecord = null;

  private String awardInstanceAnalysisReportType = null;

  private String awardInstanceAnalysisParameters = null;

  private Object awardInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return awardInstanceAnalysisRecord
  **/

  public Object getAwardInstanceAnalysisRecord() {
    return awardInstanceAnalysisRecord;
  }

  public void setAwardInstanceAnalysisRecord(Object awardInstanceAnalysisRecord) {
    this.awardInstanceAnalysisRecord = awardInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return awardInstanceAnalysisReportType
  **/

  public String getAwardInstanceAnalysisReportType() {
    return awardInstanceAnalysisReportType;
  }

  public void setAwardInstanceAnalysisReportType(String awardInstanceAnalysisReportType) {
    this.awardInstanceAnalysisReportType = awardInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return awardInstanceAnalysisParameters
  **/

  public String getAwardInstanceAnalysisParameters() {
    return awardInstanceAnalysisParameters;
  }

  public void setAwardInstanceAnalysisParameters(String awardInstanceAnalysisParameters) {
    this.awardInstanceAnalysisParameters = awardInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return awardInstanceAnalysisReport
  **/

  public Object getAwardInstanceAnalysisReport() {
    return awardInstanceAnalysisReport;
  }

  public void setAwardInstanceAnalysisReport(Object awardInstanceAnalysisReport) {
    this.awardInstanceAnalysisReport = awardInstanceAnalysisReport;
  }


}

