package com.example.myapplication;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Example {

    final OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    Completable runRx(String url){
        return Completable.fromAction(new Action() {
            @Override
            public void run() throws Throwable {

            }
        });
    }

    Request bodyString(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
             return request;
    }
}


