package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;

/* loaded from: classes.dex */
public final class ParsedUrl {
    public Path path;
    public RepoInfo repoInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParsedUrl parsedUrl = (ParsedUrl) obj;
        if (this.repoInfo.equals(parsedUrl.repoInfo)) {
            return this.path.equals(parsedUrl.path);
        }
        return false;
    }

    public int hashCode() {
        return (this.repoInfo.hashCode() * 31) + this.path.hashCode();
    }
}
