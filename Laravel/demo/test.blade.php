
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> Test </title>
</head>
<body>

    {{-- * Foreach and Forelse --}}
    {{-- <h1> Activities </h1>
    <ul>

        @forelse ($activities as $item)

            <li> {{ $item }} </li>

        @empty 
        
            <strong> Not found Activities </strong>

    @endforelse

    </ul> --}}

    {{-- * layouts master --}}
    @extends('layouts.master')
    
    @section('title')
    
        User info

    @endsection

    @section('content')
    
        <h2> Name {{ $name }} </h2>
        <h2> Age {{ $age }} </h2>
        <h2> Email {{ $email }} </h2>
        <ul>
    
    @forelse ($activities as $item)

        <li> {{ $item }} </li> @empty <strong> Not Found Activities </strong>

    @endforelse

        </ul>

    @endsection

</body>
</html>