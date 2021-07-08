package io.ionic.starter;

import android.app.AlertDialog;
import android.webkit.WebView;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

import com.braintreepayments.api.PopupBridgeClient;
import com.getcapacitor.CapConfig;
import com.getcapacitor.Plugin;

import java.util.List;

public class MainActivity extends BridgeActivity {

  private PopupBridgeClient mPopupBridgeClient;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public void onStart() {
    super.onStart();
    WebView webView = bridge.getWebView();
    mPopupBridgeClient = new PopupBridgeClient(this, webView, "io.ionic.starter.browserswitch");
    mPopupBridgeClient.setErrorListener(error -> showDialog(error.getMessage()));
  }

  public void showDialog(String message) {
    new AlertDialog.Builder(this)
      .setMessage(message)
      .setPositiveButton(android.R.string.ok, (dialog, which) -> dialog.dismiss())
      .show();
  }
}
