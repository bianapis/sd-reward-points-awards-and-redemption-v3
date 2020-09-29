package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAwardRetrieveOutputModelAwardInstanceReport
 */
public class BQAwardRetrieveOutputModelAwardInstanceReport   {
  private Object awardInstanceReportRecord = null;

  private String awardInstanceReportType = null;

  private String awardInstanceReportParameters = null;

  private Object awardInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return awardInstanceReportRecord
  **/

  public Object getAwardInstanceReportRecord() {
    return awardInstanceReportRecord;
  }

  public void setAwardInstanceReportRecord(Object awardInstanceReportRecord) {
    this.awardInstanceReportRecord = awardInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return awardInstanceReportType
  **/

  public String getAwardInstanceReportType() {
    return awardInstanceReportType;
  }

  public void setAwardInstanceReportType(String awardInstanceReportType) {
    this.awardInstanceReportType = awardInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return awardInstanceReportParameters
  **/

  public String getAwardInstanceReportParameters() {
    return awardInstanceReportParameters;
  }

  public void setAwardInstanceReportParameters(String awardInstanceReportParameters) {
    this.awardInstanceReportParameters = awardInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return awardInstanceReport
  **/

  public Object getAwardInstanceReport() {
    return awardInstanceReport;
  }

  public void setAwardInstanceReport(Object awardInstanceReport) {
    this.awardInstanceReport = awardInstanceReport;
  }


}

