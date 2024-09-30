package org.mandulis.mts.logging;

import jakarta.persistence.*;
import lombok.*;
import org.mandulis.mts.user.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String action;

    @Column(nullable = false)
    private LocalDateTime timestamp;
}

