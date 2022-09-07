package demo;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;

public class check {

	// Contact address been taken from deployed contract

	private static final String CONTRACT_ADDRESS = "0xFC7a6574C177DBfB42bD278DDD2c7ABd947fd058";

	private static final String ADMIN_PRIVATE_KEY = "0x91603a9618b4fd500533f750d47702fdfc845de7bb7d6d7546262030510dcaaa";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Web3j client initialization
		
		        Web3j web3 = Web3j.build(new HttpService("http://127.0.0.1:8545"));
		
		        ContractGasProvider gasProvider;
		
		        gasProvider = new DefaultGasProvider();
		        
		        //System.out.println(web3.ethGetWork());
	
		
		        //Accessing to passport service as admin and creating new passport for JOHN_ACCOUNT
	
		        Credentials credentials = Credentials.create(ADMIN_PRIVATE_KEY);
		
		        Storage storage = Storage.load(CONTRACT_ADDRESS, web3, credentials, gasProvider);
		        
		       // System.out.println(storage.getContractAddress());
		        
		        //System.out.println(storage.getGasPrice());
		        
		        storage.store("Hello World Java again!").send();
		        System.out.println(storage.retrieve().send());
	        
		        
	}

}
