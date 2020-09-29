package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAwardRetrieveInputModelAwardInstanceAnalysis;
import org.bian.dto.BQAwardRetrieveInputModelAwardInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAwardRetrieveInputModel
 */
public class BQAwardRetrieveInputModel   {
  private Object awardRetrieveActionTaskRecord = null;

  private String awardRetrieveActionRequest = null;

  private BQAwardRetrieveInputModelAwardInstanceReport awardInstanceReport = null;

  private BQAwardRetrieveInputModelAwardInstanceAnalysis awardInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return awardRetrieveActionTaskRecord
  **/

  public Object getAwardRetrieveActionTaskRecord() {
    return awardRetrieveActionTaskRecord;
  }

  public void setAwardRetrieveActionTaskRecord(Object awardRetrieveActionTaskRecord) {
    this.awardRetrieveActionTaskRecord = awardRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return awardRetrieveActionRequest
  **/

  public String getAwardRetrieveActionRequest() {
    return awardRetrieveActionRequest;
  }

  public void setAwardRetrieveActionRequest(String awardRetrieveActionRequest) {
    this.awardRetrieveActionRequest = awardRetrieveActionRequest;
  }


  /**
   * Get awardInstanceReport
   * @return awardInstanceReport
  **/

  public BQAwardRetrieveInputModelAwardInstanceReport getAwardInstanceReport() {
    return awardInstanceReport;
  }

  public void setAwardInstanceReport(BQAwardRetrieveInputModelAwardInstanceReport awardInstanceReport) {
    this.awardInstanceReport = awardInstanceReport;
  }


  /**
   * Get awardInstanceAnalysis
   * @return awardInstanceAnalysis
  **/

  public BQAwardRetrieveInputModelAwardInstanceAnalysis getAwardInstanceAnalysis() {
    return awardInstanceAnalysis;
  }

  public void setAwardInstanceAnalysis(BQAwardRetrieveInputModelAwardInstanceAnalysis awardInstanceAnalysis) {
    this.awardInstanceAnalysis = awardInstanceAnalysis;
  }


}

