/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class RewardPointsAwardsAndRedemptionApiController {

	@Autowired
	RewardPointsAwardsAndRedemptionApiService service;
	
	@Transact.Activate
	public BianResponse<SDRewardPointsAwardsAndRedemptionActivateOutputModel> activate(@RequestBody BianRequest<SDRewardPointsAwardsAndRedemptionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDRewardPointsAwardsAndRedemptionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRewardPointsAwardsAndRedemptionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("award")
	@Transact.Exchange
	public BianResponse<BQAwardExchangeOutputModel> exchangeAward(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAwardExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAward(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("redemption")
	@Transact.Exchange
	public BianResponse<BQRedemptionExchangeOutputModel> exchangeRedemption(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRedemptionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeRedemption(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Exchange
	public BianResponse<CRRewardPointsTransactionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRewardPointsTransactionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Execute
	public BianResponse<CRRewardPointsTransactionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRewardPointsTransactionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDRewardPointsAwardsAndRedemptionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRewardPointsAwardsAndRedemptionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRRewardPointsTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRRewardPointsTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("award")
	@Transact.Initiate
	public BianResponse<BQAwardInitiateOutputModel> initiateAward(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAwardInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAward(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("redemption")
	@Transact.Initiate
	public BianResponse<BQRedemptionInitiateOutputModel> initiateRedemption(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRedemptionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateRedemption(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Request
	public BianResponse<CRRewardPointsTransactionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRewardPointsTransactionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRRewardPointsTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("award")
	@Transact.Retrieve
	public BianResponse<BQAwardRetrieveOutputModel> retrieveAward(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAward(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("redemption")
	@Transact.Retrieve
	public BianResponse<BQRedemptionRetrieveOutputModel> retrieveRedemption(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRedemption(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDRewardPointsAwardsAndRedemptionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRRewardPointsTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRewardPointsTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("award")
	@Transact.Update
	public BianResponse<BQAwardUpdateOutputModel> updateAward(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAwardUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAward(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("redemption")
	@Transact.Update
	public BianResponse<BQRedemptionUpdateOutputModel> updateRedemption(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRedemptionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRedemption(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
