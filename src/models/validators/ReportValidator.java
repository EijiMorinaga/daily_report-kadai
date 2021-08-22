package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if (!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }
        String time_in_hour_error = _validateTime_in_hour(r.getTime_in_hour());
        if (!time_in_hour_error.equals("")) {
            errors.add(time_in_hour_error);
        }

        String time_in_minute_error = _validateTime_in_minute(r.getTime_in_minute());
        if (!time_in_minute_error.equals("")) {
            errors.add(time_in_minute_error);
        }

        String time_out_hour_error = _validateTime_out_hour(r.getTime_out_hour());
        if (!time_out_hour_error.equals("")) {
            errors.add(time_out_hour_error);
        }

        String time_out_minute_error = _validateTime_out_minute(r.getTime_out_minute());
        if (!time_out_minute_error.equals("")) {
            errors.add(time_out_minute_error);
        }
        return errors;
    }

    private static String _validateTime_in_hour(String time_in_hour) {
        int num = Integer.parseInt(time_in_hour);
        if (num < 0 || num > 24) {
            return "出勤時間（時）が誤ってます。";
        }
        return "";
    }

    private static String _validateTime_in_minute(String time_in_minute) {
        int num = Integer.parseInt(time_in_minute);
        if (num < 0 || num > 60) {
            return "出勤時間（分）が誤ってます。";
        }
        return "";
    }

    private static String _validateTime_out_hour(String time_out_hour) {
        int num = Integer.parseInt(time_out_hour);
        if (num < 0 || num > 24) {
            return "退勤時間（時）が誤ってます。";
        }
        return "";
    }

    private static String _validateTime_out_minute(String time_out_minute) {
        int num = Integer.parseInt(time_out_minute);
        if (num < 0 || num > 60) {
            return "退勤時間（分）が誤ってます。";
        }
        return "";
    }

    private static String _validateTitle(String title) {
        if (title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if (content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }
}