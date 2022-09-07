# firstblockchain

Steps:
0. set up blockchain project using truffle - mkdir firstblockcahin => truffle init
1. Write your contract file using solidity under contracts folder created by truffle
2. Compile the contract
3. start your ganacge test network - ganache-cli => RPC Listening on 127.0.0.1:8545
4. deploy your contract using remix plugin in vscode => obtain contract address after deployment this one can be used in Java project
5. Generate java client file using truffle => web3j generate truffle --truffle-json=./build/contracts/Storage.json -o . -p jai
6. Copy this java generated file and paste into your project for use.


