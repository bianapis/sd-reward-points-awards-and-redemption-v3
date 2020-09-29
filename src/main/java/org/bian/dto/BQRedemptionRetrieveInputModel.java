package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis;
import org.bian.dto.BQRedemptionRetrieveInputModelRedemptionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRedemptionRetrieveInputModel
 */
public class BQRedemptionRetrieveInputModel   {
  private Object redemptionRetrieveActionTaskRecord = null;

  private String redemptionRetrieveActionRequest = null;

  private BQRedemptionRetrieveInputModelRedemptionInstanceReport redemptionInstanceReport = null;

  private BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis redemptionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return redemptionRetrieveActionTaskRecord
  **/

  public Object getRedemptionRetrieveActionTaskRecord() {
    return redemptionRetrieveActionTaskRecord;
  }

  public void setRedemptionRetrieveActionTaskRecord(Object redemptionRetrieveActionTaskRecord) {
    this.redemptionRetrieveActionTaskRecord = redemptionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return redemptionRetrieveActionRequest
  **/

  public String getRedemptionRetrieveActionRequest() {
    return redemptionRetrieveActionRequest;
  }

  public void setRedemptionRetrieveActionRequest(String redemptionRetrieveActionRequest) {
    this.redemptionRetrieveActionRequest = redemptionRetrieveActionRequest;
  }


  /**
   * Get redemptionInstanceReport
   * @return redemptionInstanceReport
  **/

  public BQRedemptionRetrieveInputModelRedemptionInstanceReport getRedemptionInstanceReport() {
    return redemptionInstanceReport;
  }

  public void setRedemptionInstanceReport(BQRedemptionRetrieveInputModelRedemptionInstanceReport redemptionInstanceReport) {
    this.redemptionInstanceReport = redemptionInstanceReport;
  }


  /**
   * Get redemptionInstanceAnalysis
   * @return redemptionInstanceAnalysis
  **/

  public BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis getRedemptionInstanceAnalysis() {
    return redemptionInstanceAnalysis;
  }

  public void setRedemptionInstanceAnalysis(BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis redemptionInstanceAnalysis) {
    this.redemptionInstanceAnalysis = redemptionInstanceAnalysis;
  }


}

