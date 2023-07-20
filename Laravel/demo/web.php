<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\MemberController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

// * Get Default
// Route::get('/', function () {

    // return view('welcome');
    // echo 'สวัสดี Laravel';

// });

// * Require by Id
// Route::get('/user/id/{id}', function ($id) {

//     echo 'รหัสผู้ใช้ = ' . $id;
// });

// * Require by Id but not Require name
// Route::get('/user/id/{id}/{name?}' , function ($id , $name = 'default name') { 

//    echo 'รหัสผู้ใช้ = ' . $id . '<br>'; 
//    echo 'ชื่อผู้ใช้ = ' . $name . '<br>'; 
// });

// * Get by Array

// Route::get('/', function () {

//     return view('test' , array(
//         'name' => 'Punnawat Pinsaeng' ,
//         'age' => 21 ,
//         'email' => '6406021620050@fitm.kmutnb.ac.th'
//     ));

// });

// !
// Route::get('/', function () {

//     return view('test' , array(
        
//         'activities' => ['Football' , 'Photography' , "Batminton" , "Bycicle"]
//     ));

// });

// !
// Route::get('/', function () {

//     return view('test' , function () {
        
//         $activities = ['Football' , 'Photography' , "Batminton" , "Bycicle"];
//         return view('test' , compact('activities'));
//     });

// });

// * Foreach and Forelse
// Route::get('/', function () {

//     $activities = ['Football' , 'Photography' , "Batminton" , "Bycicle"];
//     return view('test' , compact('activities'));

// });

// * Layouts master
// Route::get('/' , function() {

//     return view('test' , array(

//         'name' => 'Punnawat Pinsaeng' ,
//         'age' => 21 ,
//         'email' => '6406021620050@fitm.kmutnb.ac.th' ,
//         'activities' => ['Football' , 'Photography' , "Batminton" , "Bycicle"]
//     ));

// });

// * User Controller
Route::get('/user/{id}', [App\Http\Controllers\UserController::class , 'show' ]);
Route::get('/member', [App\Http\Controllers\MemberController::class , 'index' ]);