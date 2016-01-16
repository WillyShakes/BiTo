package com.willycode.bito.UI;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.willycode.bito.R;

/**
 * Created by Manuel ELO'O on 11/01/2016.
 */
public class TweetFragment extends Fragment {
    private static final String baseURl = "https://twitter.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/BiTo_App\" data-widget-id=\"686372354902102016\" >Tweet di @BiTo_App</a>\n" +
            "<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        //TODO manage no internet case
        // Inflate the layout for this fragment
            Activity a = getActivity();
            View v = inflater.inflate(R.layout.content_tweet, container, false);

        load_background_color(v);

        WebView webView = (WebView) v.findViewById(R.id.timeline_webview);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);

            return v;
        }
    private void load_background_color(View v) {
        WebView webView = (WebView) v.findViewById(R.id.timeline_webview);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }

}
