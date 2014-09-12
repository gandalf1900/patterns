package no.web;

import org.apache.commons.lang.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ViewUtil {

    public static ViewNavigation toView(final String viewId) {
        return new ViewNavigation(viewId);
    }

    public static class ViewNavigation {
        private String viewUrl;
        private boolean redirect = false;
        private boolean includeViewParams = false;
        private boolean noConversationId = false;
        private final Map<String, String> params = new HashMap<String, String>();
        public ViewNavigation(final String viewId) {
            this.viewUrl = viewId;
        }

        public String toUrl() {
            List<String> params = new ArrayList<String>();
            if (redirect) {
                params.add("faces-redirect=true");
            }
            if (includeViewParams) {
                params.add("includeViewParams=true");
            }
            if (noConversationId) {
                params.add("nocid=true");
            }
            for(Map.Entry<String,String> entry : this.params.entrySet()) {
                params.add(entry.getKey() + "="+entry.getValue());
            }
            return viewUrl + (params.isEmpty() ? "" : ("?" + StringUtils.join(params, '&')));
        }

        @Override
        public String toString() {
            return toUrl();
        }

        public ViewNavigation withRedirect() {
            this.redirect = true;
            return this;
        }

        public ViewNavigation withViewParams() {
            includeViewParams = true;
            return this;
        }

        public ViewNavigation withNoConversationId() {
            noConversationId = true;
            return this;
        }

        public ViewNavigation withParams(final Map<String, String> params) {
            this.params.putAll(params);
            return this;
        }

        public ViewNavigation withParam(final String name, final Object value) {
            this.params.put(name, String.valueOf(value));
            return this;
        }
    }
}
