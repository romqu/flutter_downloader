package vn.hunghd.flutterdownloader;

public class DownloadTask {
    int primaryId;
    String taskId;
    int status;
    int progress;
    String url;
    String filename;
    String savedDir;
    String headers;
    String mimeType;
    boolean resumable;
    boolean showNotification;
    boolean openFileFromNotification;
    long timeCreated;
    String fileDisplayName;

    DownloadTask(int primaryId,
                 String taskId,
                 int status,
                 int progress,
                 String url,
                 String filename,
                 String savedDir,
                 String headers,
                 String mimeType,
                 boolean resumable,
                 boolean showNotification,
                 boolean openFileFromNotification,
                 long timeCreated,
                 String fileDisplayName) {
        this.primaryId = primaryId;
        this.taskId = taskId;
        this.status = status;
        this.progress = progress;
        this.url = url;
        this.filename = filename;
        this.savedDir = savedDir;
        this.headers = headers;
        this.mimeType = mimeType;
        this.resumable = resumable;
        this.showNotification = showNotification;
        this.openFileFromNotification = openFileFromNotification;
        this.timeCreated = timeCreated;
        this.fileDisplayName = fileDisplayName;
    }

    @Override
    public String toString() {
        return "DownloadTask{" +
                "primaryId=" + primaryId +
                ", taskId='" + taskId + '\'' +
                ", status=" + status +
                ", progress=" + progress +
                ", url='" + url + '\'' +
                ", filename='" + filename + '\'' +
                ", savedDir='" + savedDir + '\'' +
                ", headers='" + headers + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", resumable=" + resumable +
                ", showNotification=" + showNotification +
                ", openFileFromNotification=" + openFileFromNotification +
                ", timeCreated=" + timeCreated +
                ", fileDisplayName='" + fileDisplayName + '\'' +
                '}';
    }
}
