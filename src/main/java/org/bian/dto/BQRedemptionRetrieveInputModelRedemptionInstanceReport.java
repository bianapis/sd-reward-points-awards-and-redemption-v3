package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRedemptionRetrieveInputModelRedemptionInstanceReport
 */
public class BQRedemptionRetrieveInputModelRedemptionInstanceReport   {
  private String redemptionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return redemptionInstanceReportReference
  **/

  public String getRedemptionInstanceReportReference() {
    return redemptionInstanceReportReference;
  }

  public void setRedemptionInstanceReportReference(String redemptionInstanceReportReference) {
    this.redemptionInstanceReportReference = redemptionInstanceReportReference;
  }


}

