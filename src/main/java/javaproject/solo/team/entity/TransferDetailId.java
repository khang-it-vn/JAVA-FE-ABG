package javaproject.solo.team.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class TransferDetailId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account_sender")
    private Account sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account_receiver")
    private Account receiver;

    public TransferDetailId() {
    }
}