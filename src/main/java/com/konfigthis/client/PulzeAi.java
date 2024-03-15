package com.konfigthis.client;

import com.konfigthis.client.api.AppsApi;
import com.konfigthis.client.api.ChatApi;
import com.konfigthis.client.api.CompletionsApi;
import com.konfigthis.client.api.LogsApi;
import com.konfigthis.client.api.ModelsApi;

public class PulzeAi {
    private ApiClient apiClient;
    public final AppsApi apps;
    public final ChatApi chat;
    public final CompletionsApi completions;
    public final LogsApi logs;
    public final ModelsApi models;

    public PulzeAi() {
        this(null);
    }

    public PulzeAi(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apps = new AppsApi(this.apiClient);
        this.chat = new ChatApi(this.apiClient);
        this.completions = new CompletionsApi(this.apiClient);
        this.logs = new LogsApi(this.apiClient);
        this.models = new ModelsApi(this.apiClient);
    }

}
