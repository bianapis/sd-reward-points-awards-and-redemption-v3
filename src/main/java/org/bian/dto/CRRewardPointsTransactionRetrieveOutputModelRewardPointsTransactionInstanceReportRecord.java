package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord
 */
public class CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord   {
  private String rewardPointsTransactionInstanceReportData = null;

  private String rewardPointsTransactionInstanceReportType = null;

  private Object rewardPointsTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return rewardPointsTransactionInstanceReportData
  **/

  public String getRewardPointsTransactionInstanceReportData() {
    return rewardPointsTransactionInstanceReportData;
  }

  public void setRewardPointsTransactionInstanceReportData(String rewardPointsTransactionInstanceReportData) {
    this.rewardPointsTransactionInstanceReportData = rewardPointsTransactionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rewardPointsTransactionInstanceReportType
  **/

  public String getRewardPointsTransactionInstanceReportType() {
    return rewardPointsTransactionInstanceReportType;
  }

  public void setRewardPointsTransactionInstanceReportType(String rewardPointsTransactionInstanceReportType) {
    this.rewardPointsTransactionInstanceReportType = rewardPointsTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return rewardPointsTransactionInstanceReport
  **/

  public Object getRewardPointsTransactionInstanceReport() {
    return rewardPointsTransactionInstanceReport;
  }

  public void setRewardPointsTransactionInstanceReport(Object rewardPointsTransactionInstanceReport) {
    this.rewardPointsTransactionInstanceReport = rewardPointsTransactionInstanceReport;
  }


}

