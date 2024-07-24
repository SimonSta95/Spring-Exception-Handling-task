package de.neuefische.springexceptionhandlingtask;

import java.time.LocalDateTime;

public record CustomErrorMessage(
        String message,
        LocalDateTime timestamp,
        String urlToDocumention,
        int statusCode) {
}
