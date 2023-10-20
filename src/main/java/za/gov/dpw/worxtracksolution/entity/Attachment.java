package za.gov.dpw.worxtracksolution.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Attachment {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")

    private String fileId;

    private String ptsRef;
    private String fileName;
    private String fileType;

    @Column(name = "PAPERTRAIL_DOC_ID")
    private Integer papertrailDocId;

    @Column(length = 500000000)
    private byte[] fileData;


    public Attachment() {
    }

    public Attachment(String fileName, String fileType, byte[] fileData, String ptsRef) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileData = fileData;
        this.ptsRef = ptsRef;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
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

    public Integer getPapertrailDocId() {
        return papertrailDocId;
    }

    public void setPapertrailDocId(Integer papertrailDocId) {
        this.papertrailDocId = papertrailDocId;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
}
