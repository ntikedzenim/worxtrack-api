package za.gov.dpw.worxtracksolution.files;

public class FileResponse {
    String fileName;
    String fileType;
    String fileUri;

    public FileResponse(String fileName, String fileType, String fileUri) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileUri = fileUri;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}

//public class FileResponse {
//    private String fileName;
//    private String fileType;
//    private String tmpFileUri;
//    private String pemFileUri;
//
//    public FileResponse(String fileName, String fileType, String tmpFileUri, String pemFileUri) {
//        this.fileName = fileName;
//        this.fileType = fileType;
//        this.tmpFileUri = tmpFileUri;
//        this.pemFileUri = pemFileUri;
//    }
//
//    // Getters and setters
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getFileType() {
//        return fileType;
//    }
//
//    public void setFileType(String fileType) {
//        this.fileType = fileType;
//    }
//
//    public String getTmpFileUri() {
//        return tmpFileUri;
//    }
//
//    public void setTmpFileUri(String tmpFileUri) {
//        this.tmpFileUri = tmpFileUri;
//    }
//
//    public String getPemFileUri() {
//        return pemFileUri;
//    }
//
//    public void setPemFileUri(String pemFileUri) {
//        this.pemFileUri = pemFileUri;
//    }
//}

