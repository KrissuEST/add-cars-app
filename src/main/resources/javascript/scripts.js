// Function for loading all the car classes
function loadClasses() {
    var brandId = $("#brand").val();
    $.get("/classes?brandId=" + brandId, function(data) {
        var options = '<option value="">Select Class</option>';
        data.forEach(function(cls) {
            options += '<option value="' + cls.id + '">' + cls.name + '</option>';
        });
        $("#class").html(options);
        $("#model").html('<option value="">Select Model</option>');
    });
}

// Function for loading all the car models
function loadModels() {
    var classId = $("#class").val();
    $.get("/models?classId=" + classId, function(data) {
        var options = '<option value="">Select Model</option>';
        data.forEach(function(model) {
            options += '<option value="' + model.id + '">' + model.name + '</option>';
        });
        $("#model").html(options);
    });
}