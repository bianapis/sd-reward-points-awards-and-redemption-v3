package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis
 */
public class BQRedemptionRetrieveInputModelRedemptionInstanceAnalysis   {
  private String redemptionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return redemptionInstanceAnalysisReference
  **/

  public String getRedemptionInstanceAnalysisReference() {
    return redemptionInstanceAnalysisReference;
  }

  public void setRedemptionInstanceAnalysisReference(String redemptionInstanceAnalysisReference) {
    this.redemptionInstanceAnalysisReference = redemptionInstanceAnalysisReference;
  }


}

