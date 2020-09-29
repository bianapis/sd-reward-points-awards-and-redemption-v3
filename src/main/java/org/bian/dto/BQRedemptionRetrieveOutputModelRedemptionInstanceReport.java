package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRedemptionRetrieveOutputModelRedemptionInstanceReport
 */
public class BQRedemptionRetrieveOutputModelRedemptionInstanceReport   {
  private Object redemptionInstanceReportRecord = null;

  private String redemptionInstanceReportType = null;

  private String redemptionInstanceReportParameters = null;

  private Object redemptionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return redemptionInstanceReportRecord
  **/

  public Object getRedemptionInstanceReportRecord() {
    return redemptionInstanceReportRecord;
  }

  public void setRedemptionInstanceReportRecord(Object redemptionInstanceReportRecord) {
    this.redemptionInstanceReportRecord = redemptionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return redemptionInstanceReportType
  **/

  public String getRedemptionInstanceReportType() {
    return redemptionInstanceReportType;
  }

  public void setRedemptionInstanceReportType(String redemptionInstanceReportType) {
    this.redemptionInstanceReportType = redemptionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return redemptionInstanceReportParameters
  **/

  public String getRedemptionInstanceReportParameters() {
    return redemptionInstanceReportParameters;
  }

  public void setRedemptionInstanceReportParameters(String redemptionInstanceReportParameters) {
    this.redemptionInstanceReportParameters = redemptionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return redemptionInstanceReport
  **/

  public Object getRedemptionInstanceReport() {
    return redemptionInstanceReport;
  }

  public void setRedemptionInstanceReport(Object redemptionInstanceReport) {
    this.redemptionInstanceReport = redemptionInstanceReport;
  }


}

