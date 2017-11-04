const gulp = require('gulp');
const concat = require('gulp-concat');
const browserSync = require('browser-sync').create();


// Some pointless comments for our project.

var devMode = false;

gulp.task('css', function() {
    gulp.src("./public/styleCSS/*.css")
        .pipe(concat('libs.css'))
        .pipe(gulp.dest('./dist/css'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('controllers', function() {
    gulp.src("./public/js/controllers/*.js")
        .pipe(concat('controllers.js'))
        .pipe(gulp.dest('./dist/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('vendor', function() {
    gulp.src("./public/js/vendor/*.js")
        .pipe(concat('vendor.js'))
        .pipe(gulp.dest('./dist/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('jquery', function() {
    gulp.src("./public/js/*.js")
        .pipe(concat('jquery.js'))
        .pipe(gulp.dest('./dist/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

//
gulp.task('html', function() {
    return gulp.src('./public/templates/*.html')
        .pipe(gulp.dest('./dist/'))
        .pipe(browserSync.reload({
            stream: true
        }));
});
//
gulp.task('build', function() {
    gulp.start(['controllers','vendor','jquery','css','html'])
});

gulp.task('browser-sync', function() {
    browserSync.init(null, {
        open: false,
        server: {
            baseDir: 'dist',
        }
    });
});

gulp.task('start', function() {
    devMode = true;
    gulp.start(['build', 'browser-sync']);
    gulp.watch(['./public/stlyeCSS/*.css'], ['css']);
    gulp.watch(['./public/js/controllers/*.js'], ['controllers']);
    gulp.watch(['./public/js/vendor/*.js'],['vendor']);
    gulp.watch(['./public/js/*.js'],['jquery']);
    gulp.watch(['./public/templates/*.html'], ['html']);
});
