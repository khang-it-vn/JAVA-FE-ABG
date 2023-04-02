package javaproject.solo.team.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "transferdetail")
public class TransferDetail {
    @EmbeddedId
    private TransferDetailId id;

    public TransferDetail() {
    }
}