package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAwardRetrieveInputModelAwardInstanceAnalysis
 */
public class BQAwardRetrieveInputModelAwardInstanceAnalysis   {
  private String awardInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return awardInstanceAnalysisReference
  **/

  public String getAwardInstanceAnalysisReference() {
    return awardInstanceAnalysisReference;
  }

  public void setAwardInstanceAnalysisReference(String awardInstanceAnalysisReference) {
    this.awardInstanceAnalysisReference = awardInstanceAnalysisReference;
  }


}

