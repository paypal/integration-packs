# PayPal Integration Packs

This repository is aimed at developers, and is a collection of working demos of various integrations of PayPal services.

### Disclaimer
Please note that these demos are developed by our global engineering teams on a volunteer basis to help merchants to understand our client SDK integration. These are NOT our official sample code.  Please feel free to use them as a reference and develop your own client component that is suitable to your system and business logic.



## CodePen Samples

CodePen examples that developers can use as reference to integrate PayPal services such as Braintree and PayPal Smart Payment Buttons.

### Braintree
* [Braintree Client JS SDK](https://github.com/paypal/integration-packs/blob/main/codepen-samples/braintree-client-sdk.md)
  * Hosted Fields
  * Drop-in UI
  * 3DS

### PayPal

* [PayPal Smart Payment Buttons / JS SDK](https://github.com/paypal/integration-packs/blob/main/codepen-samples/paypal-js-sdk.md)	

## Postman Collections

Postman collections for sending API requests to PayPal services such as Braintree and direct PayPal integrations.

### Braintree API
* [Braintree GraphQL API](https://github.com/paypal/integration-packs/blob/main/postman-collections/Braintree-GraphQL.postman_collection.json)


### PayPal API

* [PayPal Payouts API](https://github.com/paypal/integration-packs/blob/main/postman-collections/PayPal-Payouts-API.postman_collection.json)

* [PayPal Webhooks API](https://github.com/paypal/integration-packs/blob/main/postman-collections/PayPal-Webhooks.postman_collection.json)

## PopupBridge Samples

## References
### Test Card Numbers
As a quick reference, any of the test card numbers below can be used for either PayPal wallet flow or Braintree card flow.  Please note that test card numbers for Braintree might not work on PayPal wallet and vice versa.

#### PayPal Wallet
|Test Value|Card Type|
|----------|---------|
|4239538668121621|Visa|
|5125763927083297|Mastercard|
|349313082270122|American Express|
|6011474915859384|Discover|
|5038270606265696|Maestro|
|3568621173513335|JCB|

[Generate Test Card Numbers](https://developer.paypal.com/developer/creditCardGenerator/)

#### Braintree

|Test Value|Card Type|
|----------|---------|
|378282246310005|American Express|
|36259600000004|Diners Club (processed as Discover)|
|6011000991300009|Discover|
|3530111333300000|JCB|
|6304000000000000|Maestro|
|5555555555554444|Mastercard|
|4005519200000004|Visa|

[More Test Card Numbers](https://developer.paypal.com/braintree/docs/reference/general/testing#credit-card-numbers)

