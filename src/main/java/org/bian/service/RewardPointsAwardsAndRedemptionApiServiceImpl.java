/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RewardPointsAwardsAndRedemptionApiServiceImpl implements RewardPointsAwardsAndRedemptionApiService {

	public SDRewardPointsAwardsAndRedemptionActivateOutputModel activate(SDRewardPointsAwardsAndRedemptionActivateInputModel request){
		return JsonReader.read("activate-SDRewardPointsAwardsAndRedemptionActivateOutputModel.json",new TypeReference<SDRewardPointsAwardsAndRedemptionActivateOutputModel>(){});
	}
	
	public SDRewardPointsAwardsAndRedemptionConfigureOutputModel configure(String sdReferenceId, SDRewardPointsAwardsAndRedemptionConfigureInputModel request){
		return JsonReader.read("configure-SDRewardPointsAwardsAndRedemptionConfigureOutputModel.json",new TypeReference<SDRewardPointsAwardsAndRedemptionConfigureOutputModel>(){});
	}
	
	public BQAwardExchangeOutputModel exchangeAward(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAwardExchangeInputModel request){
		return JsonReader.read("exchange-BQAwardExchangeOutputModel.json",new TypeReference<BQAwardExchangeOutputModel>(){});
	}
	
	public BQRedemptionExchangeOutputModel exchangeRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRedemptionExchangeInputModel request){
		return JsonReader.read("exchange-BQRedemptionExchangeOutputModel.json",new TypeReference<BQRedemptionExchangeOutputModel>(){});
	}
	
	public CRRewardPointsTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRRewardPointsTransactionExchangeOutputModel.json",new TypeReference<CRRewardPointsTransactionExchangeOutputModel>(){});
	}
	
	public CRRewardPointsTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRRewardPointsTransactionExecuteOutputModel.json",new TypeReference<CRRewardPointsTransactionExecuteOutputModel>(){});
	}
	
	public SDRewardPointsAwardsAndRedemptionFeedbackOutputModel feedback(String sdReferenceId, SDRewardPointsAwardsAndRedemptionFeedbackInputModel request){
		return JsonReader.read("feedback-SDRewardPointsAwardsAndRedemptionFeedbackOutputModel.json",new TypeReference<SDRewardPointsAwardsAndRedemptionFeedbackOutputModel>(){});
	}
	
	public CRRewardPointsTransactionInitiateOutputModel initiate(String sdReferenceId, CRRewardPointsTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRRewardPointsTransactionInitiateOutputModel.json",new TypeReference<CRRewardPointsTransactionInitiateOutputModel>(){});
	}
	
	public BQAwardInitiateOutputModel initiateAward(String sdReferenceId, String crReferenceId, BQAwardInitiateInputModel request){
		return JsonReader.read("initiate-BQAwardInitiateOutputModel.json",new TypeReference<BQAwardInitiateOutputModel>(){});
	}
	
	public BQRedemptionInitiateOutputModel initiateRedemption(String sdReferenceId, String crReferenceId, BQRedemptionInitiateInputModel request){
		return JsonReader.read("initiate-BQRedemptionInitiateOutputModel.json",new TypeReference<BQRedemptionInitiateOutputModel>(){});
	}
	
	public CRRewardPointsTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionRequestInputModel request){
		return JsonReader.read("request-CRRewardPointsTransactionRequestOutputModel.json",new TypeReference<CRRewardPointsTransactionRequestOutputModel>(){});
	}
	
	public CRRewardPointsTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRRewardPointsTransactionRetrieveOutputModel.json",new TypeReference<CRRewardPointsTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAwardRetrieveOutputModel retrieveAward(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAwardRetrieveOutputModel.json",new TypeReference<BQAwardRetrieveOutputModel>(){});
	}
	
	public BQRedemptionRetrieveOutputModel retrieveRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRedemptionRetrieveOutputModel.json",new TypeReference<BQRedemptionRetrieveOutputModel>(){});
	}
	
	public SDRewardPointsAwardsAndRedemptionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDRewardPointsAwardsAndRedemptionRetrieveOutputModel.json",new TypeReference<SDRewardPointsAwardsAndRedemptionRetrieveOutputModel>(){});
	}
	
	public CRRewardPointsTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRewardPointsTransactionUpdateInputModel request){
		return JsonReader.read("update-CRRewardPointsTransactionUpdateOutputModel.json",new TypeReference<CRRewardPointsTransactionUpdateOutputModel>(){});
	}
	
	public BQAwardUpdateOutputModel updateAward(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAwardUpdateInputModel request){
		return JsonReader.read("update-BQAwardUpdateOutputModel.json",new TypeReference<BQAwardUpdateOutputModel>(){});
	}
	
	public BQRedemptionUpdateOutputModel updateRedemption(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRedemptionUpdateInputModel request){
		return JsonReader.read("update-BQRedemptionUpdateOutputModel.json",new TypeReference<BQRedemptionUpdateOutputModel>(){});
	}
	
}
