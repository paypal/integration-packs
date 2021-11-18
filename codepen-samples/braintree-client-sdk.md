# Codepen Samples for Braintree client JS SDK Integration

## Braintree Drop-in UI

Braintree Drop-in UI is a complete, ready-made payment UI that offers a quick and easy way to securely accept payments. The UI includes a card entry form and, if enabled, PayPal, Google Pay, and Venmo buttons. When a user successfully completes the UI, your client code obtains a payment method nonce for use on your server.

[Card](https://codepen.io/franco-rae/pen/mdmxzEJ) | [Card + PayPal](https://codepen.io/franco-rae/pen/MWmVPyQ) | [Card + PayPal + Google Pay](https://codepen.io/franco-rae/pen/zYwWmrL)

[3DS](https://codepen.io/vimalnath53/pen/zYNPQzZ)

## Braintree Card Hosted Fields

In order to be eligible for the easiest level of PCI compliance – SAQ A – certain payment fields on the checkout page must be hosted securely. This requires you to host the information on an external payment gateway's domain and present the fields to your users in a frame or with a redirect.

Braintree Hosted Fields solution accomplishes this by rendering an iframe to handle input of the following payment fields on your checkout page:

* Card number
* CVV
* Expiration date
* Postal code

This provides you with the ability to customize the look and feel of your web page while ensuring that you are compliant with PCI requirements.

[Simple](https://codepen.io/braintree/pen/ZWPpPG) | [Material](https://codepen.io/braintree/pen/mPgdPN) | [Minimal](https://codepen.io/braintree/pen/EKJVXp) | [Raw](https://codepen.io/braintree/pen/grQJQM) |  [3D Transform](https://codepen.io/braintree/pen/oLxqjd) | [Bootstrap v4](https://codepen.io/braintree/pen/zeamxM) | [Expiration Date Drop Down](https://codepen.io/braintree/pen/QGrXav)

## Other Features

#### 3DS

[Hosted Fields](https://codepen.io/vimalnath53/pen/vYxyKXL) | [Hosted Fields(Vault Flow)](https://codepen.io/vimalnath53/pen/WNpRGey) | [Recollecting CVV in Vault Flow](https://codepen.io/vimalnath53/pen/YzZNaWm) | [Data Only 3DS Flow](https://codepen.io/vimalnath53/pen/KKWaoZZ)

Hosted Field Examples in Developer Docs:
[More Examples](https://developers.braintreepayments.com/guides/hosted-fields/examples/javascript/v3)


### Wallet Payment Methods:

Braintree helps you offer the leading payment methods such as PayPal, Apple Pay and Google Pay to your customers without complicating your checkout.

[PayPal](https://codepen.io/ksuralta/pen/qBmPYYd) | Apple Pay | [Google Pay](https://codepen.io/the_tfulton/pen/abvpeWV) | [Local Payment Methods](https://codepen.io/the_tfulton/pen/RwwERNQ) | [PayPal Checkout.js (legacy)](https://codepen.io/the_tfulton/pen/PoomRmb)

[PayPal Change Payment Method (Edit FI)](https://codepen.io/ksuralta/pen/jObBENN)


## References

[Developer guide](https://developers.braintreepayments.com/guides/hosted-fields/overview/javascript/v3) | [Developer reference](https://braintree.github.io/braintree-web/current/)
