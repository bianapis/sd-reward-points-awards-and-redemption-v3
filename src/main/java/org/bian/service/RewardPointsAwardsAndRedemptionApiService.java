/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RewardPointsAwardsAndRedemptionApiService {

	SDRewardPointsAwardsAndRedemptionActivateOutputModel activate(SDRewardPointsAwardsAndRedemptionActivateInputModel request);
	
	SDRewardPointsAwardsAndRedemptionConfigureOutputModel configure(String sdReferenceId, SDRewardPointsAwardsAndRedemptionConfigureInputModel request);
	
	BQAwardExchangeOutputModel exchangeAward(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAwardExchangeInputModel request);
	
	BQRedemptionExchangeOutputModel exchangeRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRedemptionExchangeInputModel request);
	
	CRRewardPointsTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionExchangeInputModel request);
	
	CRRewardPointsTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionExecuteInputModel request);
	
	SDRewardPointsAwardsAndRedemptionFeedbackOutputModel feedback(String sdReferenceId, SDRewardPointsAwardsAndRedemptionFeedbackInputModel request);
	
	CRRewardPointsTransactionInitiateOutputModel initiate(String sdReferenceId, CRRewardPointsTransactionInitiateInputModel request);
	
	BQAwardInitiateOutputModel initiateAward(String sdReferenceId, String crReferenceId, BQAwardInitiateInputModel request);
	
	BQRedemptionInitiateOutputModel initiateRedemption(String sdReferenceId, String crReferenceId, BQRedemptionInitiateInputModel request);
	
	CRRewardPointsTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionRequestInputModel request);
	
	CRRewardPointsTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAwardRetrieveOutputModel retrieveAward(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRedemptionRetrieveOutputModel retrieveRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDRewardPointsAwardsAndRedemptionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRRewardPointsTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionUpdateInputModel request);
	
	BQAwardUpdateOutputModel updateAward(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAwardUpdateInputModel request);
	
	BQRedemptionUpdateOutputModel updateRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRedemptionUpdateInputModel request);
	
}
